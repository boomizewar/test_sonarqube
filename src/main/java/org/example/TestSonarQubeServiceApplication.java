package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
//@EnableAspectJAutoProxy(proxyTargetClass=true)
public class TestSonarQubeServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(TestSonarQubeServiceApplication.class, args);
	}

}
