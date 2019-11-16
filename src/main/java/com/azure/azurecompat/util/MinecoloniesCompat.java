package com.azure.azurecompat.util;

import com.azure.azurecompat.AzureCompat;
import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.cloth.ClothBoots;
import com.robertx22.mine_and_slash.database.gearitemslots.cloth.ClothHelmet;
import com.robertx22.mine_and_slash.database.gearitemslots.cloth.ClothPants;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Sword;

public class MinecoloniesCompat {

	public MinecoloniesCompat() {
		MineAndSlashAPI.addCompatibleItem("minecolonies:chiefsword", new ConfigItem().setType(Sword.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("minecolonies:iron_scimitar", new ConfigItem().setType(Sword.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("minecolonies:santa_hat", new ConfigItem().setType(ClothHelmet.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("minecolonies:pirate_leggins", new ConfigItem().setType(ClothPants.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("minecolonies:pirate_boots", new ConfigItem().setType(ClothBoots.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("minecolonies:pirate_legs", new ConfigItem().setType(ClothPants.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("minecolonies:pirate_shoes", new ConfigItem().setType(ClothBoots.INSTANCE));
		AzureCompat.LOGGER.info("Registered Minecolonies Gear");
	}

}