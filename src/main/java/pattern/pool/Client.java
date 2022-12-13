package pattern.pool;
// decrease of creation of objects. reuse it. for instance reuse connection with database
public class Client {
    public static void main(String[] args) {

        ObjectPool objectPool = new ObjectPool();
        PooledObject pooledObject = new PooledObject();
        objectPool.releasePooledObject(pooledObject);
    }
}
