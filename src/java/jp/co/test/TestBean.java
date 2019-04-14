/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.test;

import javax.annotation.PostConstruct;
import javax.faces.bean.SessionScoped;


import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author 沙樹
 */
@Named(value = "testBean")
@SessionScoped	
public class TestBean {
    
    private String name;
    private int age;
    private String msg;




    /**
     * Creates a new instance of TestBean
     */
    public TestBean() {
    }
    
    @PostConstruct		
    public void init(){

    }		
    
    public String send(){
    this.name = "Test " + this.name;		
    return "output.xhtml";		
    }	
    
}
