if [ "$#" -ne 0 ]; then
  echo "Usage: getToken.sh" >&2
  exit 1
fi
curl -s -q -k -X POST "https://van88.netlab.uky.edu:8443/sdn/v2.0/auth" -d '{"login":{"user":"sdn","password":"skyline88"}}' -H "Content-Type:application/json" | grep token | awk -F \" '{print $6}'
