package be.jslm.darwin.web.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberTest {

    @Test
    public void testMember(){

        Member member1 = new Member("Adri", "Vanderpoel");
        assertEquals("Adri", member1.getFirstName());
    }

}
