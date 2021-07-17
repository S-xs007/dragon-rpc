package serialize;

/**
 * 序列化接口
 */
public interface Serializer {
    public <T> byte[] serializer(T obj);
    public <T> Object deserialize(byte[] bytes, Class<T> clazz);
}
