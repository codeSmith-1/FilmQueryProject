package com.skilldistillery.filmquery.database;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.skilldistillery.filmquery.entities.Actor;

public class DatabaseAccessorObjectTests {
	DatabaseAccessorObject dao = new DatabaseAccessorObject();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		dao = null;
	}

	@Test
	public void findActorById_should_return_actor() {
		Actor test = new Actor(3, "Ed", "Chase");
//		assertNotNull(dao.findActorById(3));
		assertEquals(dao.findActorById(3), test);
	}

	@Test
	public void findActorsByFilmId_returns_array_of_actors() {
		assertNotNull(dao.findActorsByFilmId(1));
		assertEquals(dao.findActorsByFilmId(1).size(), 10);
	}

}
