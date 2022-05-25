class MyCodingSkills {
    String[] skills = { "Java", "C#", "Javascript", "Typescript", "Angular", "Unity", "Node", "NPM" };

    public String[] getSkills() {
        return this.skills;
    }

    public static void main(String[] args) {
        MyCodingSkills app = new MyCodingSkills();

        for (String skill : app.getSkills()) {
            System.out.println(skill);
        }
    }
}