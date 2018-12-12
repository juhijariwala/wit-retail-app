package com.wit.cart.witcart.client;

import com.wit.cart.witcart.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Component
public class CatalogClient {
    @Autowired
    private RestTemplate restTemplate;
    @Value("${catalog.url}")
    private String catalogUrl;

    public Item fetchItem(Integer itemId) {
        String fetchItemUrl = catalogUrl + "/catalog-service/items/" + itemId;
        URI uri = UriComponentsBuilder.fromUriString(fetchItemUrl).build().toUri();
        return restTemplate.exchange(uri, HttpMethod.GET, null, Item.class).getBody();
    }


}
