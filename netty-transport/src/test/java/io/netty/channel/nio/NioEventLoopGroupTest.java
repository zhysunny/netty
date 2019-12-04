package io.netty.channel.nio;

import static org.junit.Assert.*;
import io.netty.util.internal.SystemPropertyUtil;
import org.junit.*;

/**
 * NioEventLoopGroup Test
 * @author 章云
 * @date 2019/12/4 22:33
 */
public class NioEventLoopGroupTest {

    @BeforeClass
    public static void beforeClass() throws Exception {
        System.out.println("Test NioEventLoopGroup Class Start...");
    }

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @AfterClass
    public static void afterClass() throws Exception {
        System.out.println("Test NioEventLoopGroup Class End...");
    }

    @Test
    public void testNoArgsConstructor() throws Exception {
        System.out.println(SystemPropertyUtil.getInt("io.netty.eventLoopThreads", 0));
        // 默认线程数是处理器的两倍
        System.out.println(Runtime.getRuntime().availableProcessors() * 2);
        NioEventLoopGroup eventExecutors = new NioEventLoopGroup();
    }

} 
