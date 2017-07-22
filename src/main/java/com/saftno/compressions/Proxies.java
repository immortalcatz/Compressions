//==========================================================================================

    package com.saftno.compressions;

//==========================================================================================

    import net.minecraft.client.renderer.block.model.ModelResourceLocation;
    import net.minecraft.item.Item;
    import net.minecraft.util.ResourceLocation;
    import net.minecraftforge.client.model.ModelLoader;

//==========================================================================================

    public class Proxies {

    //======================================================================================

        public static class Common {

        //==================================================================================

            <T extends Blocks.Stem> void registerBlockRenderer(T block ) {
            //------------------------------------------------------------------------------

            //------------------------------------------------------------------------------
            }

        //==================================================================================

        }

        public static class Client extends Common {

        //==================================================================================

            <T extends Blocks.Stem> void registerBlockRenderer( T block ) {
            //------------------------------------------------------------------------------

                Item item = block.getAsItem();

                ResourceLocation rLoc  = block.getRegistryName();

                if( null == rLoc ) return;

            //------------------------------------------------------------------------------
                for( String var: new String[]{ "inventory" } ) {
            //------------------------------------------------------------------------------

                    ModelResourceLocation mrLoc = new ModelResourceLocation( rLoc , var );

                    ModelLoader.setCustomModelResourceLocation( item , 0 , mrLoc );

            //------------------------------------------------------------------------------
                }
            //------------------------------------------------------------------------------
            }

        //==================================================================================

        }

    //======================================================================================

    }

//==========================================================================================
