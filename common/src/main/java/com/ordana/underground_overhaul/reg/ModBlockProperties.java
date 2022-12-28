package com.ordana.underground_overhaul.reg;

import net.minecraft.util.StringRepresentable;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

import java.util.Locale;

public class ModBlockProperties {

    public static final BooleanProperty ILLUMINATED = BooleanProperty.create("illuminated");
    public static final BooleanProperty TOP = BooleanProperty.create("top");
    public static final BooleanProperty END = BooleanProperty.create("end");
    public static final BooleanProperty FLOOR = BooleanProperty.create("floor");
    public static final IntegerProperty CAPS = IntegerProperty.create("pickles", 1, 8);



}
