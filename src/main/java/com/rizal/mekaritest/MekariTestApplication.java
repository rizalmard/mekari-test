package com.rizal.mekaritest;

import com.rizal.mekaritest.service.ReciteService;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class MekariTestApplication {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int jumlahData = input.nextInt();
		ReciteService reciteService = new ReciteService();
		reciteService.doReadLyric(jumlahData);
	}

}
