package com.odoni.algorithms.shortener;

import org.junit.Test;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class UrlShortenerTest {

	@Test
	public void shouldReturnHashForUrl() throws NoSuchAlgorithmException {
		String url = "https://www.google.ie/search?q=felipe+odoni&aqs=chrome..69i57.7155j0j7&sourceid=chrome&ie=UTF-8";
		MessageDigest messageDigest = MessageDigest.getInstance("MD5");
		messageDigest.update(url.getBytes());
		byte[] bytes = messageDigest.digest();
		String hash = DatatypeConverter.printHexBinary(bytes).toUpperCase();
//		System.out.println(hash);
		String base64 = Base64.getEncoder().encodeToString(hash.getBytes());
//		System.out.println(base64);
	}
}
