package com.openapi.group.service;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RestController;

import com.auth.api.GroupRolesApi;
import com.auth.models.ARMAGroups;
import com.auth.models.ARMAUser;

@RestController
public class GroupServiceController implements GroupRolesApi, CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public ResponseEntity<List<ARMAGroups>> getAllRolesInGroup() { //
		String sql = "SELECT * FROM ARMAGroups";
		List<ARMAGroups> armaGroupsList = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(ARMAGroups.class));

		return new ResponseEntity<List<ARMAGroups>>(armaGroupsList, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Void> createGroup(@Valid ARMAGroups arMAGroups) {
		System.out.println(arMAGroups);
		return GroupRolesApi.super.createGroup(arMAGroups);
	}

	@Override
	public ResponseEntity<List<ARMAUser>> getAllUsers() {

		String sql = "SELECT * FROM ARMAUser";
		List<ARMAUser> armaUsersList = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(ARMAUser.class));

		return new ResponseEntity<List<ARMAUser>>(armaUsersList, HttpStatus.OK);

	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

	}

}
