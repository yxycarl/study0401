package com.atguigu.java;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * @author yxycarl
 * @date 2020/5/24 9:51
 */
public class JedisPoolTest {
    public static void main(String[] args) {
        JedisPool jedisPoolInstance = JedisPoolUtils.getJedisPoolInstance();
        System.out.println(jedisPoolInstance);
        Jedis jedis = jedisPoolInstance.getResource();
        String ping = jedis.ping();
        System.out.println(ping);
        jedis.close();
        jedisPoolInstance.close();
    }
}
