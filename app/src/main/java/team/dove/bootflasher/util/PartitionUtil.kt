package team.dove.bootflasher.util

object PartitionUtil {
    suspend fun getPartitionsList(): List<String> {
        val partitions = mutableListOf<String>()

        CmdUtil.execute(
            cmd = "su -c find /dev/block/by-name/* -exec sh -c 'echo \"\$(basename \"\$1\") -> \$(readlink -f \"\$1\")\"' _ {} \\;",
            onInfo = {
                partitions.add(it)
            })

        return partitions
    }
}