package com.assignment.main;

import com.assignment.publicaccess.PublicClass;
import com.assignment.protectedaccess.SubProtectedClass; 
public class MainClass {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        publicClass.publicMethod(); 
        SubProtectedClass subProtectedClass = new SubProtectedClass();
        subProtectedClass.callProtectedMethod();
    }
}
