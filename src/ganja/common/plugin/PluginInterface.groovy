package ganja.common.plugin

import ganja.common.di.ContainerInterface

interface PluginInterface {

    void registerServices(ContainerInterface container)
    void registerListeners(ContainerInterface container)
}