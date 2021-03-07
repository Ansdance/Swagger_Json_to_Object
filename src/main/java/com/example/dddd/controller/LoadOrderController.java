package com.example.dddd.controller;

import com.example.dddd.ShopService;
import com.example.dddd.entity.Root;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

////@RestController
////public class LoadOrderController {
////    @Autowired
////    private PatientService patientService;
//////    @RequestMapping(value = "/test", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
////    @PostMapping("/test")
////    public ResponseEntity<Void> getOrders (@RequestBody PatientDto patientDto)  {
////         patientService.Serrr();
////         return ResponseEntity.ok(null);
////    }
////}
//

@RestController
public class LoadOrderController {
    @Autowired
    private ShopService shopService;
    //    @RequestMapping(value = "/test", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @PostMapping("/test")
    public ResponseEntity<Void> getOrders (@RequestBody Root root) throws JsonProcessingException {
        shopService.shopCheck();
        return ResponseEntity.ok(null);
    }
}