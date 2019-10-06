package net.dpco.keycloak.service;

import net.dpco.keycloak.entity.Member;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberService {
    private static final List<Member> members = new ArrayList<Member>();

    static {
        members.add(new Member("bizhan" , "laripour" , "4460033641" , "male"));
        members.add(new Member("bizhan" , "laripour" , "4460033641" , "male"));
        members.add(new Member("bizhan" , "laripour" , "4460033641" , "male"));
        members.add(new Member("bizhan" , "laripour" , "4460033641" , "male"));
        members.add(new Member("bizhan" , "laripour" , "4460033641" , "male"));
    }


    public List<Member> getAll(){
        return members;
    }

    public Member add(Member member){
        members.add(member);
        return member;
    }
}
