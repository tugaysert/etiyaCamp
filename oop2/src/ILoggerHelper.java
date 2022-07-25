import java.util.List;

public interface ILoggerHelper<T,R> {

    void runLoggers(T t, List<R> r);
}
