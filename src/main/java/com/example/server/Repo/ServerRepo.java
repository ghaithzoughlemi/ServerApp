package com.example.server.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.server.Model.Server;

public interface ServerRepo extends JpaRepository<Server, Long> {
	Server findByIpAddress(String ipAddress);

}
