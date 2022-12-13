package pattern.builder;

public class WorkTable {
   private String name;
   private String color;
   private int height;
   private int weight;

   private WorkTable(Builder builder){
       this.name = builder.name;
       this.color = builder.color;
       this.height = builder.height;
       this.weight = builder.weight;

   }

    public String getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
 // static class or interface
    static class Builder{
        private String name;
        private String color;
        private int height;
        private int weight;

        public Builder(String name) {
            this.name = name;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setHeight(int height) {
            this.height = height;
            return this;
        }

        public Builder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public WorkTable build(){
           return new WorkTable(this);
        }
    }
}
