package com.wit.cart.witcart.service;

import com.wit.cart.witcart.client.CatalogClient;
import com.wit.cart.witcart.model.Cart;
import com.wit.cart.witcart.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private CatalogClient catalogClient;

    public void addItem(Integer itemId, String customerId) {
        Item item = catalogClient.fetchItem(itemId);
        Optional<Cart> cart = cartRepository.findById(customerId);
        if (cart.isPresent()) {
            List<Item> itemList = cart.get().getItems();
            if (itemList != null) {
                itemList.add(item);
            } else {
                itemList = Arrays.asList(item);
            }

            Cart updatedCart = new Cart(customerId, itemList);
            cartRepository.save(updatedCart);
        } else {
            List<Item> items = Arrays.asList(item);
            Cart saveCart = new Cart(customerId, items);
            cartRepository.save(saveCart);
        }
    }

    //        public String deleteItemFromCart(String itemId) {
//        return redisMapper.deleteItemFromCart(itemId);
//    }
////
    public List<Item> viewItemFromCart(String customerId) {
        Optional<Cart> cartOptional = cartRepository.findById(customerId);
        if (cartOptional.isPresent()) {
            return cartOptional.get().getItems();
        } else {
            return null;
        }
    }
}
