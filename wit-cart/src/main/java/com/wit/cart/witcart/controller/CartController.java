package com.wit.cart.witcart.controller;

import com.wit.cart.witcart.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/cart")
public class CartController {
    @Autowired
    private CartService cartService;

    @PostMapping("add")
    public ResponseEntity addItemsCart(@RequestParam int itemId, @RequestParam String customerId) {
        cartService.addItem(itemId, customerId);
        return ResponseEntity.ok().build();
    }

//    @GetMapping("remove")
//    public ResponseEntity removeItemFromCart(@RequestParam String itemId) {
//        return ResponseEntity.ok().body(cartService.deleteItemFromCart(itemId));
//    }

    @GetMapping("view/{customerId}")
    public ResponseEntity viewItemsInCart(@PathVariable String customerId) {
        return ResponseEntity.ok().body(cartService.viewItemFromCart(customerId));
    }
}
