package com.pluralsight.client;

import org.junit.Test;

import com.pluralsight.model.Activity;

import static org.junit.Assert.*;

import java.util.List;

public class ActivityClientTest {

	@Test
	public void testGet() {
		ActivityClient client=new ActivityClient();
		
		Activity activity = client.get("1234");
		System.out.println(activity);
		
		assertNotNull(activity);
	}
	
	@Test
	public void testGetList() {
		ActivityClient client=new ActivityClient();
		
		List<Activity> activities = client.get();
		System.out.println(activities);
		
		assertNotNull(activities);
	}

}
