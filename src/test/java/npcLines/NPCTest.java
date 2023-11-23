package npcLines;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NPCTest {
    @Test
    public void mustReturnPesantLine(){
        NPC npc = new Pesant();
        npc.setName("James");
        npc.setRole("Fazendeiro");
        assertEquals("Olá, viajante, meu nome é James sou Fazendeiro e no momento não estou vendendo nada.", npc.introduce());
    }

    @Test
    public void mustReturnSalesmanLine(){
        NPC npc = new Salesman();
        npc.setName("James");
        npc.setRole("Vendedor de Jóias");
        assertEquals("Olá, viajante, meu nome é James sou Vendedor de Jóias e estou vendendo uns itens.", npc.introduce());
    }
}