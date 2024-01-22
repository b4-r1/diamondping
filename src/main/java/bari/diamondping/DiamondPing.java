package bari.diamondping;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DiamondPing implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("diamondping");

	@Override
	public void onInitialize() {
		LOGGER.info("yuo're code work");
	}
}