package org.frame.redis.master_slave;

import org.junit.Before;
import org.junit.Test;

import redis.clients.jedis.Jedis;

public class TestRedis {
	private Jedis master;
	private Jedis slave;
	/**
	 * 连接redis服务器
	 */
	@Before
	public void connectRedis() {
		// 使用连接类，连接redis服务器
		master = RedisMasterUtil.getJedis();
		slave = RedisSlaveUtil.getJedis();
	}

	@Test
	public void testMasterAndSlave() {
		master.set("age", "18");
		System.out.println(slave.get("age"));
	}
	
	
	
	
}
