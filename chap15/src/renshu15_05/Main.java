package renshu15_05;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		LocalDate future = now.plusDays(100);
		//上記は「LocalDate future = now.plus(Period.ofDays(100));」という記述でもOK。
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
		System.out.println(future.format(fmt));
	}

}
