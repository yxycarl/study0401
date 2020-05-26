package com.atguigu.java;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @author yxycarl
 * @date 2020/5/22 8:56
 */
public class JedisPoolUtils {

//        //Jedis指通过Java连接Redis服务端
//        Jedis jedis=new Jedis("linux0225", 6379);
//        String ping = jedis.ping();
//        System.out.println(ping);

//        //通用的连接池配置
//        GenericObjectPoolConfig poolConfig = new GenericObjectPoolConfig();
//        System.out.println(poolConfig);
//        JedisPool jedisPool=new JedisPool(poolConfig, "192.168.6.25", 6379,60000);
//        Jedis jedis = jedisPool.getResource();
//        String ping = jedis.ping();
//        System.out.println(ping);
//        //如果是从连接池中获取的，那么执行close方法只是将连接放回到池中
//        jedis.close();
//        jedisPool.close();

    private JedisPoolUtils() {
    }

    private static volatile JedisPool jedisPool=null;

    public static JedisPool getJedisPoolInstance(){
        if (null==jedisPool){
            synchronized (JedisPoolUtils.class){
                if (null==jedisPool){
                    JedisPoolConfig poolConfig = new JedisPoolConfig();
                    poolConfig.setMaxTotal(200);//最大连接数
                    poolConfig.setMaxIdle(50);//最大空闲连接数
                    //获取连接时的最大等待毫秒数,如果超时就抛异常,默认-1
                    poolConfig.setMaxWaitMillis(100*1000);
                    //连接耗尽时是否阻塞, false报异常,ture阻塞直到超时, 默认true
                    poolConfig.setBlockWhenExhausted(true);
                    //在获取连接的时候检查有效性, 默认false
                    poolConfig.setTestOnBorrow(true);
                    jedisPool = new JedisPool(poolConfig, "192.168.6.25", 6379, 6000);
                }
            }
        }
        return jedisPool;
    }
}
