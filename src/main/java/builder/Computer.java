package builder;

public class Computer {
    private String processor;
    private String memory;
    private String graphicCard;

    private Computer(ComputerBuilder computerBuilder) {
        this.processor = computerBuilder.processor;
        this.memory = computerBuilder.memory;
        this.graphicCard = computerBuilder.graphicCard;
    }

    public static class ComputerBuilder{
        private String processor;
        private String memory;
        private String graphicCard;


        public Computer build(){
            return new Computer(this);
        }

        public ComputerBuilder buildProcessor(String processor){
            this.processor = processor;
            return this;
        }

        public ComputerBuilder buildMemory(String memory){
            this.memory = memory;
            return this;
        }

        public ComputerBuilder buildGraphicCard(String graphicCard){
            this.graphicCard = graphicCard;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", memory='" + memory + '\'' +
                ", graphicCard='" + graphicCard + '\'' +
                '}';
    }
}
