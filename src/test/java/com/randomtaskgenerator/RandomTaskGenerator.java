package com.randomtaskgenerator;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class RandomTaskGenerator
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(RandomTaskGeneratorPlugin.class);
		RuneLite.main(args);
	}
}