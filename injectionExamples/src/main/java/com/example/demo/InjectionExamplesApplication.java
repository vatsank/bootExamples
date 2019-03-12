package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.domains.Catalog;
import com.example.demo.domains.FoodItem;
import com.example.demo.domains.lombok.BookStore;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class InjectionExamplesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(InjectionExamplesApplication.class, args);
		
		  FoodItem idly = ctx.getBean("first",FoodItem.class);
		  
		  idly.setItemCode(101);
		  idly.setItemName("Idly");
		  idly.setItemType("BreakFast");
		  idly.setCategory("SouthIndian");
		  idly.setUnitPrice(40.00);
		  
		log.info(idly.toString());
		
		Catalog southFood = ctx.getBean(Catalog.class);
		 
		System.out.println(southFood.getAddress());
		log.info(southFood.toString());

		southFood.getItemList().stream().map(eachItem -> eachItem.getItemName()).forEach(System.out::println);
		
		
		DiscountService service = ctx.getBean(DiscountService.class);
		
		DiscountNotification protoBean;
		
		protoBean = service.getDiscount("april");
				
				log.info("Hash Code :="+protoBean.hashCode());
		
		log.info("Discount :="+protoBean.showDiscount());
		
		
		protoBean = service.getDiscount("may");
		
		log.info("Hash Code :="+protoBean.hashCode());

		
		log.info("Discount  :="+protoBean.showDiscount());

       
		  BookStore store = ctx.getBean(BookStore.class);
				  
				  store.printRating();
		
              ctx.close();		 
	}

}
