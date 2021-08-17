package com.crm.util;

import java.nio.charset.Charset;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

import io.netty.util.internal.ThreadLocalRandom;
import net.bytebuddy.utility.RandomString;

public class CommonUtil {
	
	public static int generateRandomNumber() {
		int rand_Number = ThreadLocalRandom.current().nextInt();
		return rand_Number;
	}
	
	public static String generateRandomName() {
		String genRanName = RandomStringUtils.randomAlphabetic(8);
		return genRanName;
		
		
	}

}
