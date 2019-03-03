package com.example.demo.props;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import lombok.Data;

@Configuration
@Data
@PropertySource(value="mydata.properties")
public class InjectProps {

	
    @Value("string value")
    private String stringValue;

    @Value("${value.from.file}")
    private String valueFromFile;

    @Value("${listOfValues}")
    private String[] valuesArray;
    
    @Value("#{${valuesMap}}")
    private Map<String, Integer> valuesMap;

    public static void main(String[] args) {
		
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(InjectProps.class);
        
          InjectProps bean = applicationContext.getBean(InjectProps.class);
          
          System.out.println(bean.getStringValue());
          
          System.out.println(bean.getValueFromFile());
          
          String[] data = bean.getValuesArray();
          
           for(String eachItem:data) {
        	   System.out.println(eachItem);
           }
          
           Map<String,Integer> map = bean.getValuesMap();
           
            System.out.println(map.get(1));
            

	}
}
