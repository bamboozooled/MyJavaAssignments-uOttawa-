public interface Queue
{
        public abstract boolean isEmpty();
        public abstract void enqueue(Job o);
        public abstract Object dequeue();

        public abstract void clear();

}