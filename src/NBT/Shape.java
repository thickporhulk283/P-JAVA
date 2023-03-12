package NBT;

public abstract class Shape {
    
        protected String color;
        protected boolean filled;
    
        public Shape() {
            color = "xanh";
            filled = true;
    
        }
        public Shape(String color, Boolean filled) {
            this.color = color;
            this.filled = filled;
        }
    
        public String getColor() {
            return color;
        }
        public void setColor(String color) {
            this.color = color;
        }
        public boolean getFilled() {
            return filled;
        }
        public void setFiller(boolean filled) {
            this.filled = filled;
        }
    
    
        abstract public double getArea();
        abstract public double getPerimeter();
    
        public String toString() {
            return String.format("A Shape voi mau  %s va %s", color, (filled ? "duoc to day " : "ko duoc to day "));
        }
    }
    

