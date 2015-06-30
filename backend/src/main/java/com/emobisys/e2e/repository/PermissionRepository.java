package com.emobisys.e2e.repository;

import com.emobisys.e2e.domain.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Permission entity.
 */
public interface PermissionRepository extends JpaRepository<Permission, String> {
}
