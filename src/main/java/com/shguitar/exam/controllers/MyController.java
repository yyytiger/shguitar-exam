package com.shguitar.exam.controllers;

//import com.fasterxml.jackson.databind.ObjectMapper;
import com.shguitar.exam.models.Order;
import org.springframework.web.bind.annotation.*;

import java.util.GregorianCalendar;

@RestController
@RequestMapping("/my")
public class MyController {
    @ModelAttribute("purchaser")
    public String getName() {
        return "Allon";
    }

    @RequestMapping(value = "/orders", method = RequestMethod.GET)
    @ResponseBody
    public Order getOrders(@ModelAttribute("purchaser") String purchaser) {
        Order order = new Order();
        order.setPurcaser(purchaser);
        order.setOrderDate(new GregorianCalendar());
        return order;
    }

    @RequestMapping(value = "/orders/json", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public String getOrdersJson(@ModelAttribute("purchaser") String purchaser) throws Exception {
        Order order = new Order();
        order.setPurcaser(purchaser);
        order.setOrderDate(new GregorianCalendar());
        //ObjectMapper mapper = new ObjectMapper();
        try {
            String result = ""; //mapper.writeValueAsString(order);
            return result;
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @RequestMapping(value = "/orders/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Order getOrders(
            @PathVariable("id") int orderId,
            @RequestParam(value = "name", required = false, defaultValue = "Unknown") String name
    ) {
        Order order = new Order();
        order.setId(orderId);
        order.setPurcaser(name);
        return order;
    }

    @RequestMapping(value = "/orders", method = RequestMethod.POST)
    @ResponseBody
    public Order saveOrder(@RequestBody Order order) {
        order.setId(999);
        return order;
    }
}
