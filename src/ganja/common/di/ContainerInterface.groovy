package ganja.common.di

interface ContainerInterface {

    void setParameter(String key, String value)

    String getParameter(String key)

    DefinitionInterface register(String id, String classNameOrServiceId)

    def get(String id)
}