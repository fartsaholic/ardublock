package com.ardublock.translator.block;

import com.ardublock.translator.Translator;
import com.ardublock.translator.block.basic.ConstBlock;

public class TrueBlock extends ConstBlock
{
	protected TrueBlock(Long blockId, Translator translator)
	{
		super(blockId, translator);
		this.setCode("true");
	}
}