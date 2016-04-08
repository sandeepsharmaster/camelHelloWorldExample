package com.javacodegeeks.camel;

import java.util.Scanner;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class CamelFileRouter {
	
	public static void main(String args[]) throws Exception {
        CamelContext context = new DefaultCamelContext();
        context.addRoutes(new RouteBuilder() {
            public void configure() {
                from("file:D://Workspaces//WorkspaceCamel//Folder_1").to("file:D://Workspaces//WorkspaceCamel//Folder_2");
            }
        });
        context.start();
        System.out.println("Press enter to continue...");
        Scanner keyboard = new Scanner(System.in);
        keyboard.nextLine();
        context.stop();
    }

}
