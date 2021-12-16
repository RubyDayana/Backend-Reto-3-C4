package com.hiper;

import com.hiper.model.Order;
import com.hiper.model.Supplement;
import com.hiper.model.User;
import com.hiper.repository.crud.OrderCrudRepository;
import com.hiper.repository.crud.SupplementCrudRepository;
import com.hiper.repository.crud.UserCrudRepository;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HipercaloricoApplication implements CommandLineRunner {

    @Autowired
    private UserCrudRepository userRepo;

    @Autowired
    private SupplementCrudRepository supRepo;
    
    @Autowired
    private OrderCrudRepository orderRepo;

    public static void main(String[] args) {
        SpringApplication.run(HipercaloricoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        userRepo.deleteAll();
        supRepo.deleteAll();
        orderRepo.deleteAll();

        //para efectos de formateo de fechas
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");   
    }

}
