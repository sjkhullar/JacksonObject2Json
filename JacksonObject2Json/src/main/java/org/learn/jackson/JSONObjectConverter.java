package org.learn.jackson;

import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JSONObjectConverter 
{
    public static void main( String[] args ) throws IOException
    {
    	ObjectMapper objectMapper = new ObjectMapper();
    	//Set pretty printing of json
    	objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
    	Person objPerson = new Person("Mike", "harvey", 34, "001894536");
    	
    	//Convert Person object to json
    	String json = objectMapper.writeValueAsString(objPerson);
    	System.out.println("1. Convert Person object to Json");
    	System.out.println(json);
    	
    	//Convert to json to person object    	
    	System.out.println("2. Convert JSON to person object");
    	Person objFromJson = objectMapper.readValue(json, Person.class);
    	System.out.println(objFromJson); 
    }
}
