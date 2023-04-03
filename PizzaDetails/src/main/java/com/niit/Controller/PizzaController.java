package com.niit.Controller;


import com.niit.domain.Pizza;
import com.niit.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/v2/")
public class PizzaController {

    private PizzaService pizzaService;

    @Autowired
    public PizzaController(PizzaService pizzaService){this.pizzaService=pizzaService;}


    @PostMapping("/addOrder")
    public ResponseEntity<?> savePizzaDetails(@RequestBody Pizza pizza)
    {
        Pizza pizzaOrder=pizzaService.savePizzaDetails(pizza);
        return new ResponseEntity<>(pizzaOrder, HttpStatus.OK);
    }

    @GetMapping("/Orders")
    public ResponseEntity<?> findallOrdersDetails()
    {
        List<Pizza> ordersList=pizzaService.findallOrdersDetails();
        return new ResponseEntity<>(ordersList, HttpStatus.OK);
    }


    @GetMapping("/order/{userName}")
    public ResponseEntity<?> getUserOrderDetails(@PathVariable String userName){
        Pizza fetchedProduct=null;
        ResponseEntity responseEntity = null;
       // try {
            fetchedProduct = pizzaService.getUserOrderDetails(userName);

            return   responseEntity = new ResponseEntity<>("given data found", HttpStatus.OK);
      //  } catch (NoSuchElementException e1) {
        //    throw new ProductNotFoundException();

        //}

    }


    @DeleteMapping("/order/{userName}")
    public ResponseEntity<?> deleteProduct(@PathVariable String userName)
    {

        Pizza fetchOrder = pizzaService.getUserOrderDetails(userName);
        ResponseEntity responseEntity = null;
       // if (fetchPro != null) {
        pizzaService.deleteOrder(userName);
            return responseEntity = new ResponseEntity<>("given data Deleted", HttpStatus.OK);

      //  }

      //  throw new ProductNotFoundException();
    }
}
