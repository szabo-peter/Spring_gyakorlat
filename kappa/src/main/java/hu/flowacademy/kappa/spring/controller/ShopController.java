package hu.flowacademy.kappa.spring.controller;

import hu.flowacademy.kappa.spring.controller.requests.Shopmodel;
import hu.flowacademy.kappa.spring.controller.responses.Shop;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class ShopController {
    private int id = 0;
    private Map<Integer, Shop> shops = new HashMap<>();

//    @GetMapping("/api/v1/shop")
//    public ResponseEntity<String> getAllshop(){
//        return ResponseEntity.accepted().body("Alma");
//    }
//
//    @GetMapping("/api/v1/shop/{id}")
//    public ResponseEntity<String> getAllShop1(@PathVariable int id){
//        if(id % 2 == 0){
//            return ResponseEntity.ok().body("Alma");
//        }
//        else{
//            return ResponseEntity.notFound().build();
//        }
//    }

    @GetMapping("/api/v1/shop")
    public Collection<Shop> getAllShop() {
//        var x = new Shop();
//        x.setName("Flow");
//        return List.of(x,x,x);
        return shops.values();
    }

    @GetMapping("/api/v1/shop/{id}")
    public ResponseEntity<Shop> getAllShop(@PathVariable String id) {
        var item = shops.get(id);
        if (item != null) {
            return ResponseEntity.ok(new Shop());

        } else {
            return ResponseEntity.notFound().build();
        }
//        if (id.equals("10")){
//            return ResponseEntity.ok(new Shop());
//        }
//        else{
//            return ResponseEntity.notFound().build();
//        }
    }

    @GetMapping("/minta")
    public UUID get() {
        return UUID.randomUUID();
    }

    @PostMapping("/api/v1/shop")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<Shop> postShop(@RequestBody Shopmodel model) {
        var newId = id++;
        var shop = new Shop();
        shop.setName(model.getName());
        shop.setAddress(model.getAddress());
        shop.setCategory(model.getCategory());
        shop.setSettlement(model.getSettlement());
        shop.setZip(model.getZip());
        shop.setId(newId);
        shops.put(newId, shop);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/api/v1/shop/{id}")
    public ResponseEntity<Shop> postShop(@PathVariable Integer id) {
        shops.remove(id);
        return ResponseEntity.noContent().build();
    }


}
