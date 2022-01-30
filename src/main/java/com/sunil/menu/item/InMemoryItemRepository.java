package com.sunil.menu.item;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InMemoryItemRepository extends JpaRepository<Item, Long> {}