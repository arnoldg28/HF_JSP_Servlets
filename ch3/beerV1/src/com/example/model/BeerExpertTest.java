package com.example.model;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class BeerExpertTest{
	
	
    @Test
    public void testGetBrands() {
       BeerExpert b = new BeerExpert();
	   List brands = b.getBrands();
	   
    }
	
}