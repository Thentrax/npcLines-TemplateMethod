package npcLines;

public abstract class NPC {
    private String name;
    private String role;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public abstract String isSelling();

    public String introduce(){
        return "Olá, viajante, meu nome é " + this.name +
                " sou " + this.role + " e " + this.isSelling();
    }
}
