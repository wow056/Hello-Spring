package com.hello.hellospring.repository

import com.hello.hellospring.domain.Member
import org.springframework.data.jpa.repository.JpaRepository

interface SpringDataJpaMemberRepository : JpaRepository<Member, Long>, MemberRepository {
    override fun findByName(name: String): Member?
}