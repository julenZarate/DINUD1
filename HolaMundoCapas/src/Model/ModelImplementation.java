/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Model;

/**
 *
 * @author Lander Lluvia
 */
public class ModelImplementation implements Model{
    String greeting = "Hello world!";
    
    @Override
    public String getGreeting() {
        return greeting;
    }
    
}
