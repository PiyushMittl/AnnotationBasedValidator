package com.ituple.design.nullobject;


import java.util.List;

public class CustomAnnotationRunner {

    public static void main(String... args){
        Person p = new Person();
        p.name = "Rahul Mondal";
        List errors = NotNullChecker.validate(p);
        if(errors.isEmpty()){
            System.out.print("There is no error in object");
        }else{
            System.out.print("Errors in object: \n");
            for(int i = 0; i< errors.size(); i++){
                System.out.print((i+1) + ". " + errors.get(i).toString() + "\n");
            }
        }
    }

}
//http://java.raistudies.com/creating-custom-annotation-for-validating-domain-objects-field-value/
