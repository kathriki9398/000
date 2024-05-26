package ram;


import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.checkerframework.checker.units.qual.s;

public class AS {
public static void main(String[] args) {
	
	
	
int a[] = {1,23,4,243,4,3,32};


int max = Integer.MIN_VALUE;
int se= Integer.MIN_VALUE;

for(int i=0;i<a.length;i++) {
	
	
	if(a[i]>max) {
		se= max;
		max=a[i];
	}
	if(a[i]!=max && a[i]>se) {
		se=a[i];
	}
	
}
	System.out.println(se);
	
	

	
	
	
}}